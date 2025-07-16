package com.xworkz.country;

import java.util.Collection;
import java.util.Optional;

public class CountryDetailRunner {
    public static void main(String[] args) {
        CountryRepository countryRepository =new CountryRepositoryImp();
        Collection<CountryDTO> countryDTOS= countryRepository.getCountryName();
        System.out.println("-------------------------------1.Find all country---------------------------------------");
        countryDTOS.stream()
                .forEach((e)-> System.out.println(e.getCountryName()));
        System.out.println("--------------------------------2.Find all country ending with a--------------------------------------");
        countryDTOS.stream()
                .filter((c)->c.getCountryName().toLowerCase().endsWith("a"))
                .forEach(e-> System.out.println(e));
        System.out.println("-----------------------------3.starting with r-----------------------------------------");
        countryDTOS.stream()
                .filter((c)->c.getCountryName().toLowerCase().startsWith("r"))
                .forEach((s)-> System.out.println(s));
        System.out.println("------------------------------4.find country by pin code-----------------------------------------");
        countryDTOS.stream()
                .filter(c -> c.getPinCode() == 638514)
                .forEach((e)-> System.out.println(e.getCountryName()));
        System.out.println("------------------------------5.find optional country by prime minister------------------------------------------");
    Optional<CountryDTO> optional =
        countryDTOS.stream()
                .filter((e)->"narendra modi".equalsIgnoreCase(e.getPrimeMinister()))
                .findFirst();
        optional.ifPresent(countryDTO -> System.out.println(countryDTO.getCountryName()));
        System.out.println("-------------------------------6.find country by lang-----------------------------------------");
        countryDTOS.stream()
                .filter((e)->e.getPrimaryLang().toLowerCase().equals("english"))
                .forEach((e)-> System.out.println(e.getCountryName()));
        System.out.println("--------------------------------7.mass between----------------------------------------");
        countryDTOS.stream()
                .filter((e) -> e.getMassInSqrMtrs() >= 301340 && e.getMassInSqrMtrs() <=8515767 )
                .forEach((s)-> System.out.println(s.getCountryName()));
        System.out.println("------------------------------8. less than 20 states------------------------------------------");
        countryDTOS.stream()
                .filter((f)->f.getNoOfStates()<=20)
                .forEach((s)-> System.out.println(s.getCountryName()));

    }
}