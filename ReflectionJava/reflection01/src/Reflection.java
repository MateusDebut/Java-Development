import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {

    public static void refletirObjeto(Object objeto, Class classe) throws IllegalAccessException, InvocationTargetException {
        System.out.println("nome da classe: " + classe.getName());
        System.out.println("nome do tipo: " + classe.getTypeName());
        System.out.println("\nAtributos\n");

        Field[] fields = classe.getDeclaredFields();
        for (Field field: fields) {
            System.out.println(field.getName() + " : " + field.getType().getTypeName());
            field.setAccessible(true);
            System.out.println(field.getName() + " : " + field.get(objeto));
            if(field.getType().isPrimitive()){
                field.set(objeto, ((Integer)field.get(objeto) ^ 2));
            }else{
                field.set(objeto, null);
            }

            System.out.println(field.getName() + " : " + field.get(objeto));

            System.out.println();
        }

        System.out.println("\nAtributos\n");
        Method[] metodos = classe.getDeclaredMethods();

        Method method = metodos[0];
        System.out.println("invocação do metodo: " + method.invoke(objeto));

        for (Method metodo: metodos){
            System.out.printf(metodo.getName() + " parametros : ");
            Arrays.stream(metodo.getParameterTypes()).sequential().forEach(p -> System.out.printf(p.getTypeName() + " "));
            System.out.println(", retorno : " + metodo.getReturnType().getSimpleName());
            System.out.println();
        }
    }
}
