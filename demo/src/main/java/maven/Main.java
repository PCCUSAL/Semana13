package maven;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Paco", "Perez", "32", "paco@gmail,com");
        Gson gson = new Gson();

        String json = gson.toJson(p);
        System.out.println(json);
    }
}