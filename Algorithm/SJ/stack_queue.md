# 스택과 큐

## 스택이란? 

>스택(Stack)이란 데이터를 쌓아올린 자료구조로, 후입선출(LIFO, Last In First Out)의 구조이다. 
데이터를 한 방향으론만 쌓을 수 있고, 최상부에만 데이터를 저장, 제거, 조회할 수 있다. 

## JAVA 주요 메서드

선언방법

```java
Stack<Integer> integerStack = new Stack<>(); // 숫자 데이터를 담는 스택
Stack<String> stringStack = new Stack<>(); // 문자 데이터를 담는 스택
```

사용방법 - 자료 넣기

```java

    Stack<Integer> stack = new Stack<>();
    
		// push() 또는 add()를 사용할 수 있다.
    stack.push(1);
    stack.push(2);
    stack.push(3);

    for(Integer n : stack) { // 출력
      System.out.println(n);
    }
```

자료 삭제

```java
  // pop() : 가장 최근에 삽입된 값(최상부 데이터) 삭제. 
  // 스택이 비었을시 EmptyStackException 예외 발생
  stack.pop();
  
  // clear() : 스택을 완전히 비움
  stack.clear();
```

최상단 데이터를 제거하지 않으면서 출력

```java
// 최상단 데이터 리턴
// 스택이 비었을시 EmptyStackException 예외 발생
stack.peek() 
```

기타 메소드

```java

stack.size();      // stack의 크기 출력 
stack.empty();     // stack이 비어있는지의 여부, 비어있다면 true
stack.contains(1) // 해당 값이 스택 안에 있는지의 여부
stackInt.search(2) // 해당 값이 스택에서 빠져나오는 순서를 리턴, 만약에 값이 없을 시 -1
``` 

## 큐란? 
>선입선출(FIFO)의 구조를 띈 자료구조로, 가장 먼저 삽입된 데이터가 있는 곳(Front)에서 조회, 삭제가 일어나고, 뒤(rear)에서 삽입이 일어난다. 

## JAVA 주요 메소드

자바에서 큐의 메소드는 예외가 발생하는 메소드, 아닌 메소드로 구별할 수 있다. 
삭제/출력의 경우 빈 큐일 경우에 예외가 발생한다. 

|  | 예외 발생 | 예외 발생x |
| --- | --- | --- |
| 삽입 | add | offer |
| front 삭제 | remove | poll |
| front 출력 | element | peek |

삽입

```java

Queue<Integer> queue = new LinkedList<>();

queue.add(1);
queue.offer(1);
```

front 삭제

```java
// 삭제 
queue.poll(); // 성공 시 삭제한 값을, 실패시(빈 큐) null 반환
queue.remove();
```

front 출력

```java
// front 출력
queue.element();
queue.peek(); // 성공 시 front 값을, 실패시(빈 큐) null 반환
```


