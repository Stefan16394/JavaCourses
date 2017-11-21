package E04_Java_Advanced_Exam_19_June_2016;

import com.sun.org.apache.xerces.internal.xs.LSInputList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class P01_Cubic_Artillery {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder text = new StringBuilder();
        ArrayDeque<Bunker> bunkers = new ArrayDeque<>();
        ArrayDeque<Integer> weapons = new ArrayDeque<>();
        int capacity = Integer.parseInt(sc.readLine());
        while (true) {
            String[] input = sc.readLine().split(" ");
            if (input[0].equals("Bunker")) {
                break;
            }
            for (String element : input) {
                try {
                    int weapon = Integer.parseInt(element);
                    weapons.offer(weapon);
                } catch (NumberFormatException e) {
                    Bunker newBunker = new Bunker();
                    newBunker.name = element;
                    newBunker.weapons = new ArrayList<>();
                    newBunker.capacity = capacity;
                    bunkers.offer(newBunker);
                }
            }
        }
        while (weapons.size() > 0) {
            Bunker currentBunker = bunkers.pollFirst();
            Integer weapon = weapons.pollFirst();
            if (currentBunker.capacity - weapon >= 0) {
                currentBunker.weapons.add(weapon);
                currentBunker.capacity -= weapon;
                bunkers.offerFirst(currentBunker);
            } else if (bunkers.size() == 0) {
                boolean foundSpace = false;
                while (currentBunker.weapons.size() > 0 && !foundSpace) {
                    currentBunker.weapons.remove(0);
                    if (currentBunker.capacity - weapon >= 0) {
                        currentBunker.weapons.add(weapon);
                        bunkers.offerFirst(currentBunker);
                        foundSpace = true;
                    }

                }
                if (!foundSpace) {
                    bunkers.offerFirst(currentBunker);

                }
            } else {
                System.out.print(currentBunker.name + " -> ");
                StringBuilder x = new StringBuilder();
                for (Integer gun : currentBunker.weapons) {
                    x.append(gun).append(", ");
                }
                if (x.length() > 0) {
                    x.delete(x.length() - 2, x.length());
                    System.out.println(x);
                } else {
                    System.out.println("Empty");
                }

                weapons.offerFirst(weapon);
            }

        }


    }

    static class Bunker {
        String name;
        List<Integer> weapons;
        Integer capacity;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Integer> getWeapons() {
            return weapons;
        }

        public void setWeapons(List<Integer> weapons) {
            this.weapons = weapons;
        }
    }
}


