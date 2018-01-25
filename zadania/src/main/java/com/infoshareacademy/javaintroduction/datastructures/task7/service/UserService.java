package com.infoshareacademy.javaintroduction.datastructures.task7.service;

import com.infoshareacademy.javaintroduction.datastructures.task7.domain.Permission;
import com.infoshareacademy.javaintroduction.datastructures.task7.domain.Person;
import com.infoshareacademy.javaintroduction.datastructures.task7.domain.Role;
import com.infoshareacademy.javaintroduction.datastructures.task7.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserService {

    public static List<User> findUsersWhoHaveMoreThanOneAddress(List<User> users) {
        List<User> listaOdfiltrowana = new ArrayList<>();
        for (User user : users) {
            if (user.getPersonDetails().getAddresses().size() > 1) {
                listaOdfiltrowana.add(user);
            }
        }

        return listaOdfiltrowana;
    }

    public static Person findOldestPerson(List<User> users) {
        int maxAge = 0;
        User oldestUser = null;
        for (User user : users) {
            if (user.getPersonDetails().getAge() > maxAge) {
                maxAge = user.getPersonDetails().getAge();
                oldestUser = user;
            }
        }
        return oldestUser.getPersonDetails();

    }

    public static User findUserWithLongestUsername(List<User> users) {
        int maxLength = 0;
        User longestNamedUser = null;
        for (User user : users) {
            if (user.getName().length() > maxLength) {
                maxLength = user.getName().length();
                longestNamedUser = user;
            }
        }
        return longestNamedUser;
    }

    public static String getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(List<User> users) {
        String retval = "";
        for (User user : users) {
            if (user.getPersonDetails().getAge() > 18) {
                if (retval.length() > 0) {
                    retval += ",";  //przecinek dokładamy tylko, jeżeli już ktoś jest na liście
                }
                retval += user.getName() + " " + user.getPersonDetails().getSurname();
            }
        }
        return retval;
    }

    public static List<String> getSortedPermissionsOfUsersWithNameStartingWithA(List<User> users) {
        List<String> retval = new ArrayList<>();
        for (User user : users) {
            if (user.getName().startsWith("A")) {
                List<Permission> permissions = user.getPersonDetails().getRole().getPermissions();
                for (Permission permission : permissions) {
                    if (!retval.contains(permission.getName())) {
                        retval.add(permission.getName());
                    }
                }
            }
        }
        retval.sort(String.CASE_INSENSITIVE_ORDER);
        return retval;
    }

    public static void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(List<User> users) {
        for (User user : users) {
            if (user.getPersonDetails().getSurname().startsWith("S")) {
                System.out.println("--- User: " + user.getName().toUpperCase() + " " + user.getPersonDetails().getSurname().toUpperCase());
                for (Permission permission : user.getPersonDetails().getRole().getPermissions()) {
                    System.out.println("           " + permission.getName().toUpperCase());
                }
            }
        }
    }

    public static Map<Role, List<User>> groupUsersByRole(List<User> users) {
        Map<Role, List<User>> retval = new TreeMap<>();   // Map to tylko interfejs, więc trzeba utworzyć instancję klasy
        for (User user : users) {
            Role currentUserRole = user.getPersonDetails().getRole();
            if (retval.containsKey(currentUserRole)) {
                retval.get(currentUserRole).add(user);
            } else {
                List<User> userList = new ArrayList<>();
                userList.add(user);
                retval.put(currentUserRole, userList);
            }
        }
        return retval;
    }
    public static Map<Boolean, List<User>> partitionUserByUnderAndOver18(List<User> users) {
        Map<Boolean, List<User>> retval = new TreeMap<>();   // Map to tylko interfejs, więc trzeba utworzyć instancję klasy
        retval.put(false, new ArrayList<>());
        retval.put(true, new ArrayList<>());
        for (User user : users) {
            retval.get(user.getPersonDetails().getAge() <= 18).add(user);
        }
        return retval;
    }
}