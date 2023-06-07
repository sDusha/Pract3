public class Main {
    public static void main(String[] args) throws InterruptedException {
        listmpl<Integer> listmpl = new listmpl<>();
        setimpl<Integer> setimpl = new setimpl<>();
        listmpl.add(0);
        new Thread(() -> {
            for (int j = 0; j < 120; j++) {
                //System.out.println(list.get(0));
                int n = listmpl.get(0) + 1;
                listmpl.set(0, n);
                setimpl.add(j);
            }
        }).start();
        new Thread(() -> {
            for (int j = 0; j < 120; j++) {
                //System.out.println(list.get(0));
                int n = listmpl.get(0) + 1;
                listmpl.set(0, n);
                setimpl.add(120 + j);
            }
        }).start();
        Thread.sleep(200);
        System.out.println(listmpl.get(0));
        System.out.println(setimpl.size());
    }
}