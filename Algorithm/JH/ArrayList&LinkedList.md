### ArrayList & LinkedList 

대부분의 그래프 데이터를 저장하는 자료구조 이다. 

* 초기화하기 

```markdown
ArrayList<Edge> list[] = new ArrayList[10];

보통 

class Edge{
   int endNode;
   int value;
} 

도착노드와 가중치 10은 표현하고자 하는 노드의 개수이다. 
```

* 할당하기 
```markdown

  각 배열의 위치에 ArrayList 를 넣자. 

 for(int i=0; i<10; i++) {
   list[i] = new ArrayList<Edge>();
 }

```

* 그래프에 데이터 저장하기 
```markdown
 for(int i=0; i<E; i++) { // E 는 저장할 엣지의 수이다
   st = new StringTokenizer(br.readLine());
   int s = Integer.parseInt(st.nextToken());
   int e = Integer.parseInt(st.nextToken());
   int v = Integer.parseInt(st.nextToken());
   list[s].add(new Edge(e,v));
   }
```

* 그래프 데이터 가져오기 
```markdown
 // 2번 노드에 연결된 에지 정보를 알고 싶다면 
 
 for(int i=0; i<list[2].size(); i++) {
    Edge tmp = list[2].get(i);
    int next = tmp.endNode;
    int value = tmp.value;
   }
 


