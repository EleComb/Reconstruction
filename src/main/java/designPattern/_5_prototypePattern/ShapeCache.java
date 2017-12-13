package designPattern._5_prototypePattern;

import designPattern._5_prototypePattern.entity.Circle;
import designPattern._5_prototypePattern.entity.Rectangle;
import designPattern._5_prototypePattern.entity.Square;
import designPattern._5_prototypePattern.iml.Shape;

import java.util.Hashtable;

/**
 * 原型接口用于创建当前对象的克隆。
 */
class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}