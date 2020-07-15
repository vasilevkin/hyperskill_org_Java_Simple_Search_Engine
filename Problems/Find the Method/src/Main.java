import java.lang.reflect.Method;

class MethodFinder {

    public static String findMethod(String methodName, String[] classNames) {

        String className = null;

        for (String name : classNames) {
            Method[] methods = name.getClass().getMethods();

            for (Method method : methods) {
                String n = method.getName();
//                System.out.println(n);
                if (n.equals(methodName)) {
                    className =  method.getClass().getName();
                }
            }
        }
        return className;
    }

    public static void main(String[] args) {
        String name = findMethod("abs", new String[]{"String", "Math"});

        System.out.println(name);
    }
}
