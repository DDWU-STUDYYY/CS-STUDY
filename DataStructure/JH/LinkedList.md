### LinkedList

* 각 노드가 데이터와 포인터를 가지고 한 줄로 연결되어 있는 방식의 자료구조이다. 
```markdown

 // LinkedList 의 선언 
 
 LinkedList list = new LinkedList(); // 초기의 크기를 미리 생성 안됨 
 
 // LinkedList 의 값 추가 
 
 LinkedList<Integer> list = new LinkedList<Integer>();
 
 list.addFirst(1); // 가장 앞에 데이터 추가 
 list.addLast(2); // 가장 뒤에 데이터 추가 
 list.add(3); // 데이터를 추가 
 list.add(1,10); // index 1 에 데이터 10 추가 
 
 
 // LinkedList 의 값 삭제 
 
 LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
 list.removeFirst();
 list.removeLast();
 list.remove();
 list.remove(1);
 list.clear();
 
 // LinkedList 의 크기 구하기 
 
 System.out.println(list.size());
 
 // LinkedList 의 값 출력 
 
 for(Integer i : list) {
    System.out.println();
    }
    
    Iterator<Integer> iter = iter.iterator();
    while(iter.hasNext()) {
       System.out.println(iter.next());
       }

// LinkedList 값 검색 

 System.out.println(list.contains(1));
 System.out.println(list.indexOf(1));
 



































* 코테 자바 문법 : https://choo.oopy.io/21907edf-1c3f-4109-9032-307a656ac7ee