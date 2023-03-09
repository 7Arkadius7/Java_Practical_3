Arrays.sort (new ArrayList[] {ints});
System.out.println(ints);
System.out.println("Минимум: " + ints.get(0));
System.out.println("Максимум: " + ints.get(ints.size()-1));

int sum = 0;
for (int i : ints) {
    sum+=i;
}

System.out.println ("Средняя: " + sum / ints.size());