package org.nullhint._002_singleton;

/**
 * 静态内部类实现单例模式。
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {

    }

    private static class SingletonHandler {
        private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHandler.singleton;
    }
}
