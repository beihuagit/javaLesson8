package com.design.builder.expand;

/**
 * 建造者模式变种
 * @author 洛水晴川
 * @date 2021/7/28 17:09
 * */
public class Computer {
    /**
     * 必须
     */
    private final String cpu;
    /**
     * 必须
     */
    private final String ram;
    /**
     * 可选
     */
    private final int usbCount;
    /**
     * 可选
     */
    private final String keyboard;
    /**
     * 可选
     */
    private final String display;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.display = builder.display;
        this.keyboard = builder.keyboard;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer("Computer[");
        if (cpu != null) {
            str.append("cpu='\"").append(cpu).append("\",");
        }
        if (ram != null) {
            str.append("ram=\"").append(ram).append("\",");
        }
        if (usbCount != 0) {
            str.append("usbCount=").append(usbCount).append(",");
        }
        if (keyboard != null) {
            str.append("keyboard=\"").append(keyboard).append("\",");
        }
        if (display != null) {
            str.append("display=\"").append(display).append("\",");
        }
        str.deleteCharAt(str.length() - 1);
        str.append("]");
        return str.toString();
    }

    public static class Builder {
        private String cpu;//必须
        private String ram;//必须
        private int usbCount;//可选
        private String display;//可选
        private String keyboard;//可选

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
