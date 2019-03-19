package org.nullhint._002_singleton;

/**
 * 双检查锁实现单例模式。
 */
public class DoubleCheckedLockSingleton {

    private DoubleCheckedLockSingleton() {

    }

    private static volatile DoubleCheckedLockSingleton singleton;

    public static DoubleCheckedLockSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckedLockSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckedLockSingleton();
                }
            }
        }

        return singleton;
    }
}
