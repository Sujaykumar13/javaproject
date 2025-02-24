package lamda.runner;

import lamda.inter.Modulos;

public class ModuosRunner {

        public static void main(String[] args)
        {
            Modulos mod = (int a, int b)-> a%b;
            float result = mod.modulos(44,10);
            System.out.println(result);
        }
    }

