package com.spring5.filters;

import com.spring5.common.CommonConstants;
import com.spring5.utils.TraceIdUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.core.annotation.Order;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 日志链路追踪
 * <p>traceId过滤器,用于设置traceId</P>
 *
 * @author chenxl
 */
@WebFilter(urlPatterns = "/*", filterName = "traceIdFilter")
@Order(1)
public class TraceIdFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //traceId初始化
        initTraceId((HttpServletRequest) servletRequest);
        //执行后续过滤器
        filterChain.doFilter(servletRequest,servletResponse);
    }

    /**
     * traceId初始化
     */
    private void initTraceId(HttpServletRequest request) {
        //尝试获取http请求中的traceId
        String traceId = request.getParameter(CommonConstants.LOG_TRACE_ID);

        //如果当前traceId为空或者为默认traceId，则生成新的traceId
        if (StringUtils.isBlank(traceId) || TraceIdUtil.defaultTraceId(traceId)){
            traceId = TraceIdUtil.genTraceId();
        }

        //设置traceId
        TraceIdUtil.setTraceId(traceId);
    }

    @Override
    protected void initFilterBean() throws ServletException {
        super.initFilterBean();
    }
}
