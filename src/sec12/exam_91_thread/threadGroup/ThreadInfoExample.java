package sec12.exam_91_thread.threadGroup;

import sec12.exam_91_thread.demon.AutosaveThread;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
    public static void main(String[] args) {
        AutosaveThread autosaveThread = new AutosaveThread();
        autosaveThread.setName("AutoSaveThread");
        autosaveThread.setDaemon(true);
        autosaveThread.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threadSet = map.keySet();
        for (Thread thread : threadSet){
            System.out.println("Name : " + thread.getName() + (thread.isDaemon() ? "데몬" : "주"));
            System.out.println("소속그룹 : " + thread.getThreadGroup().getName());
        }

    }
}
