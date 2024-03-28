### ArrayList 

1. 일반 배열과 동일하게 연속된 메모리 공간을 사용하며 인덱스는 0부터 시작한다. 
2. 배열과의 차이점은 배열은 크기가 고정인 반면 ArrayList 는 크기가 가변적으로 변하게 된다. 
3. 배열과 달리 메모리에 연속적으로 나열되어있지 않고 주소로 연결되어있는 형태이기 때문에 index 를 통한 접근 속도가 배열보다는 느리다.

* ArrayList 엘리먼트의 추가.변경 

```markdown
 ArrayList<String> colors = new ArrayList<>();
colors.add("Black");
colors.add("White");
colors.add(0,"Green");
colors.add("Red");

colors.set(0,"Blue");

System.out.println(colors) 하면 ["Black","White","Green","Red"] 의 형태로 나오게 된다!! 

```
add 는 기본적으로 리스트의 가장 끝에 값을 추가한다. 

별도로 인덱스를 지정하면 해당 인덱스에 값이 추가되고 그 인덱스로부터의 값이 1칸씩 밀리게 된다. 

* ArrayList 엘리먼트의 삭제 

삭제할 때에는 엘리먼트의 인덱스를 입력하거나 엘리먼트를 직접 입력할 수 있다. 

인덱스를 통해 삭제할 경우 삭제되는 엘리먼트를 리턴받을 수 있다. 

```markdown

 ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black","White","Green","Red"));
 String removeColor = colors.remove(0);
 System.out.println("Removed color is " + removedColor);

 colors.remove("White");
 System.out.println(colors);

 colors.clear(); // 모든 요소가 다 지워지게 된다 
 System.out.println(colors);
}
}



```

* ArrayList 전체 값의 확인 

```markdown
 ArrayList<String> colors = new ArrayList<>(Arrays.asList("Black","White","Green","Red"));

 1. for-each loop 로 확인 

  for(String color : colors) {
      System.out.print(color + " ");
  }
    System.out.println();

 2. for loop
  for(int i=0; i<colors.size(); i++){
   System.out.print(colors.get(i) + " ");
 }
  System.out.println();

  3. using iterator 
   Iterator<String> iterator = color.iterator();
    while(iterator.hasNext()) {
        System.out.print(iterator.next() + " ");
       }
       System.out.println();
       
       }
   4. 개별 단일 요소를 얻고자 한다면 get 메서드로 얻어오자 
       list.get(0); 
       list.get(3); 이런 식으로 !! 
   5. list.subList(0,7) 
```

* 값 존재 유무의 확인 

```markdown
  1. 값이 존재하는지만 알고 싶은 경우 
  
  boolean contains = colors.contains("Black");
  
  2. 어느 위치에 존재하는지 확인하고 싶은 경우 
  
  int index = colors.indexOf("Blue");
  값이 존재하지 않으면 -1 을 return 하게 된다 
  
```

* ArrayList 의 요소 변경 
```markdown
  list.set(1,"setData"); // 1번의 데이터를 문자열 setData 로 변경한다. 

```

* ArrayList 의 배열 변환 
 ```markdown
 ArrayList<String> langauges = new ArrayList<>();
 languages.add("Java");
 languages.add("Python");
 language.add("c");

 String[] arr1 = languages.toArray();

```

* ArrayList 의 정렬 
```markdown
  ArrayList list1 = new ArrayList();
   list.add("3");
   list.add("2";
   list.add("1");
   
   // 오름차순으로 정렬 
   Collections.sort(list);

   // 내림차순으로 정렬 
    Collections.sort(list,Collections.reverseOrder()
   
```

* ArrayList 의 조회 
```markdown
  Iterator<Integer> iter = lnkList.iterator();
   
    while(iter.hasNext()){
        System.out.println(iter.next());
        }

}
```

* 코딩테스트에서 쓰는 ArrayList 의 구현 
```markdown
  ArrayList<Edge> list[] = new ArrayList[10];
  
  class Edge {
     int endNode;
     int value;
     }
     
    for(int i=0; i<10; i++){
       list[i] = new ArrayList<Edge>();
   }
   
    for(int i=0; i<E; i++){
     st = new StringTokenizer(br.readLine());
     int s = Integer.parseInt(st.nextToken());
     int e = Integer.parseInt(st.nextToken());
     int v = Integer.parseInt(st.nextToken());
     list[s].add(new Edge(e,v));

    for(int i=0; i<list[2].size(); i++) {
       Edge tmp = list[2].get(i);
       int next = tmp.endNode;
       int value = tmp.value;
     }

```

```markdown

  ArrayList<Integer>[] A = new ArrayList[N+1];
  
  for(int i =1; i<=N; i++) {
      A[i] = new ArrayList<Integer>();
      
      A[S].add(E);
      B.add(E);
      
      for(int i=1; i<=N; i++) {
         Collections.sort(A[i]);
         }
         
         Collections.sort(B);
         
 ```

```markdown

 // 한번에 초기화 
 
 List<Integer> A = new ArrayList<>(Arrays.asList(9,9,9,9));
 
  



참고 : 참고 : https://inpa.tistory.com/entry/JAVA-%E2%98%95-ArrayList-%EA%B5%AC%EC%A1%B0-%EC%82%AC%EC%9A%A9%EB%B2%95