package org.nullhint._002_singleton;

/**
 * 使用枚举实现单例模式。
 */
public class EnumSingleton {

    private EnumSingleton() {

    }

    private static EnumSingleton singleton;

    private enum SingletonEnum {
        SINGLE;

        SingletonEnum() {
            singleton = new EnumSingleton();
        }

        EnumSingleton getSingleton() {
            return singleton;
        }
    }

    public static EnumSingleton getInstance() {
        return SingletonEnum.SINGLE.getSingleton();
    }
}
