## HashSet 과 HashMap 

* HashSet 

1. 중복을 허용하지 않는 집합. 
2. 데이터의 순서가 없다. 
3. add : 데이터를 삽입한다. 
4. contains : 해당 원소의 포함 여부를 나타낸다.

* ex) 
```markdown
Set<Integer> set = new HashSet<>();
set.add(1);
set.add(2);
set.add(2);
set.add(3);
System.out.println(set.contains(1)); -> 진실
System.out.println(set.contains(4)); -> 거짓
Iterator<Iteger> iter = set.iterator();
while(iter.hasNext()){
  System.out.println(iter.next());
} 
```

* HashMap 
1. Key-Value 형태로 이루어진다. 
2. key 는 중복을 허용하지 않는다. value 는 가능하다 
3. 데이터의 순서가 없다. 
4. put 으로 데이터를 삽입한다. 
5. remove(key값) 으로 데이터를 삭제한다. 
6. containsKey 로 해당 키가 존재하는지의 여부를 확인한다. 
7. clear 로 전체 요소를 삭제한다. 

ex)
```markdown
Map<String,Integer> map = new HashMap<>();
map.put("나몰빼미", 1);
map.put("브케인", 2);
map.put("수댕이" , 3);
map.put("나몰빼미",4); -> 중복 key 가 들어오면 원래의 값이 덮어씌워진다.
System.out.println(map.get("나몰빼미")) -> 4가 출력된다.
map.remove("수댕이");
map.containsKey("수댕이")); -> 거짓이다. 이미 위에서 제거됨...
```



* 이렇게 넣고 출력하는 것은 ?? 
```markdown
1. for(Integer key : map.keySet()){
  System.out.println("key : key + "value: " + map.get(key));
2. for(Map.Entry<Integer,String> elem : map.entrySet()){
  System.out.println("key : " + elem.getKey() + "value: " + elem.getValue());
3. Iterator 방식은 잘 사용하지 않는다.
Iterator<Integer> keys = map.keySet().iterator();
```

```markdown
  while(keys.hasNext()){
     Integer key = keys.next();
     System.out.println("key " + key);

}
```








