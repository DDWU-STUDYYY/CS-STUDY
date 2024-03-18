# 스택과 큐

## 스택이란? 

스택(Stack)이란 데이터를 쌓아올린 자료구조로, 후입선출(LIFO, Last In First Out)의 구조이다. 
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

