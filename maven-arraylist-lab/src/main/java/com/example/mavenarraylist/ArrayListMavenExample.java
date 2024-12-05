package com.example.mavenarraylist;
import org.apache.commons.lang3.StringUtils;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class ArrayListMavenExample {
 public static void main(String[] args) {
 List<String> fruits = new ArrayList<>();
 fruits.add("apple");
 fruits.add("banana");
 fruits.add("cherry");
 
 List<String> capitalizedFruits = new ArrayList<>();
 for (String fruit : fruits) {
 capitalizedFruits.add(StringUtils.capitalize(fruit));
 }
 System.out.println("Capitalized Fruits: " +
capitalizedFruits);
 List<String> reversedFruits =
		 Lists.reverse(capitalizedFruits);
		  System.out.println("Reversed Fruits: " + reversedFruits);
		  }
		 }
