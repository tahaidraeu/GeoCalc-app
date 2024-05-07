package com.tahaidra.geocalc;

public class Shapes {
    // حساب مساحة المستطيل
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // حساب محيط المستطيل
    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // حساب مساحة دائرة
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // حساب محيط دائرة
    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    // يمكنك هنا إضافة المزيد من الوظائف لحسابات أشكال هندسية أخرى
}

