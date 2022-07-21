import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException {
        AlunoReflection alunoReflection = new AlunoReflection(1, "Rick", "C137");
        Reflection.refletirObjeto(alunoReflection, AlunoReflection.class);
    }
}
