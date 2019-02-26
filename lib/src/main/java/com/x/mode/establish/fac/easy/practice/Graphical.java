package com.x.mode.establish.fac.easy.practice;

/**
 * 简单工厂模式练习
 * 创建不同几何形状（圆、方形、三角形） 每个图形都具有绘制draw()和擦除erase()方法，绘制不存在的几何图形，提示UnSupportedShapeException
 */
public interface Graphical {
     void draw();
     void erase();
}
