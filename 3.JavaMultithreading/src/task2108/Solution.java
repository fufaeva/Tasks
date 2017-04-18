package task2108;

/* 
Клонирование растений
Класс Plant не должен реализовывать интерфейс Cloneable
Реализуй механизм глубокого клонирования для Tree.


Требования:
1. Класс Plant не должен поддерживать интерфейс Cloneable.
2. Класс Tree должен поддерживать интерфейс Cloneable.
3. Класс Tree должен быть потомком класса Plant.
4. В классе Tree должен быть корректно реализован метод clone.
*/
public class Solution {
    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = null;
        try {
            clone = (Tree) tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(tree.branches);
        System.out.println(clone.branches);
    }

    public static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends Plant implements Cloneable {
        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }


        public String[] getBranches() {
            return branches;
        }

        public Tree clone() throws CloneNotSupportedException {

            String nameOfClone = new String(this.getName());
            String[] branchesOfClone;
            if (this.getBranches() != null) {
                branchesOfClone = new String[this.getBranches().length];
                for (int i = 0; i < this.getBranches().length; i++) {
                    branchesOfClone[i] = this.getBranches()[i];
                }
                return new Tree(nameOfClone, branchesOfClone);
            } else return new Tree(nameOfClone, null);


        }
    }
}
