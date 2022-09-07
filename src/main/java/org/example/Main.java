package org.example;

import DTOs.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import utils.HttpUtils;

public class Main {

    public static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {

        Person p1 = new Person("Sven Hansen", "Ahlgade 45, 4300 Holbæk", "53433434");
        Person p2 = new Person("Ole Carlsen", "Østerbrogade 23, 2100 Kbh Ø", "21323223");

        PersonsDTO personsDTO = new PersonsDTO();
        personsDTO.addPerson(p1);
        personsDTO.addPerson(p2);

        String json = gson.toJson(personsDTO);
        System.out.println(json);


        System.out.println("----------------");

        CurrentDataDTO currentDataDTO = new CurrentDataDTO(18,60,"Overvejende solrig", "26 m/s Sydøst");
        WeatherDTO weatherDTO = new WeatherDTO(currentDataDTO, "Roskilde, Nordsjælland");

        String json2 = gson.toJson(weatherDTO);
        System.out.println(json2);


        // Den anden vej rundt, hvor man har JSON og skal lave et objekt fra det - man skal have DTOen though
        System.out.println("---------------------");
        String weatherJSON = "{" +
                "  \"CurrentData\": {" +
                "    \"temperature\": 18," +
                "    \"humidity\": 60," +
                "    \"skyText\": \"Overvejende solrig\"," +
                "    \"windText\": \"26 m/s Sydøst\"" +
                "  }," +
                "  \"LocationName\": \"Roskilde, Sjælland\"" +
                "}";

        WeatherDTO w = gson.fromJson(weatherJSON, WeatherDTO.class);
        System.out.println(w);

        System.out.println("-----------------------");
        System.out.println("Running the two methods from main class");
        //userAPI();
        weatherAPI();

    }


    public static void userAPI() {
        System.out.println("Hello USER REST API");
        String json = HttpUtils.fetchAPIData("https://dummyapi.io/data/v1/user", "63188ed2f39baab12b4aaa7e");
        UsersDTO usersDTO = gson.fromJson(json, UsersDTO.class);
        System.out.println(usersDTO);
        System.out.println(gson.toJson(usersDTO));
    }

    public static void weatherAPI() {
        System.out.println("Hello WEATHER REST API");
        String json = HttpUtils.fetchAPIData("https://vejr.eu/api.php?location=Roskilde&degree=C",null);
        WeatherDTO weatherDTO = gson.fromJson(json, WeatherDTO.class);
        System.out.println(weatherDTO);
    }
}