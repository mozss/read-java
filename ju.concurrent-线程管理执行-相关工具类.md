

用于帮助应用程序控制线程规模, 保证应用程序在高并发场景中不会开启过多线程, 从而导致线程切换占用过多的CPU资源, 即帮助应用程序在线程规模和系统性能之间保持平衡.

[ThreadPoolExecutor类](src/java/util/concurrent/ThreadPoolExecutor.java)<br>

[ThreadPoolExecutor类](src/java/util/concurrent/ScheduledThreadPoolExecutor.java)<br>

[ForkJoinPool类](src/java/util/concurrent/ForkJoinPool.java)<br>