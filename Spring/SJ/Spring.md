# 20240305

## Spring Framework

- 자바 기반의 오픈소스 프레임워크이다.

여러 개의 서브 프로젝트로 구성되어있다. 대표적인 프로젝트로는 아래와 같이 있다.
- 스프링부트
- 스프링 데이터
- 스프링 배치
- 스프링 시큐리티

### 특징

- 경량 컨테이너 
- 제어의 역행 지원(IOC)
- 의존성 주입(DI) 지원
- 관점 지향 프로그래밍 지원

### Spring Boot

스프링 부트는 스프링 프레임워크를 보다 편리하게 해준다. 
기존에는 개발자가 직접 환경과 구성요소를 정의해주어야 했다면, 스프링부트는 그 설정, 구성요소 등을 자동으로 설정해준다. 
별도의 웹서버 설치나 실행 없이 애플리케이션 구동이 가능하다. 


### IOC란?

IOC는 Inversion Of Control의 약자로, 제어의 역행이라는 뜻이다. 프로그램의 흐름이 특정 코드에 의해 제어되는 것과는 달리, 
흐름을 외부의 프레임워크나 컨테이너에게 위임하는 것을 말한다.

Spring Framewor의 Spring 컨테이너에 의해 객체의 생성, 빈의 라이프 사이클, DI이 관리된다. 
객체 간의 결합도를 줄이고, 유연성을 향상시킬 수 있다는 장점이 있다. 

### DI란? 

DI는 Dependency Injection의 약자로, 객체가 직접 의존성을 생성하거나 관리하는 것이 아닌, 외부에서 의존성을 주입받아 사용하는 디자인 패턴이다.
클래스가 직접 다른 클래스나 객체를 생성하거나 참조하지 않는다.
객체 간의 결합도를 낮추고 유연성을 향상시킨다. 

Spring은 IOC 컨테이너가 클래스 간의 의존관계를 Bean 설정에 기반해 의존성을 관리한다. 
코드의 재사용성, 테스트 용이, 낮은 결합도를 기반으로 유지보수가 쉽다는 장점이 있다. 

Spring의 DI에는 아래와 같은 방법이 있다. 

1. 생성자 주입
2. Setter 주입
3. 필드 주입

위 3가지 방법 중에선 1번이 가장 권장되는 방식이다. 

#### 생성자 주입

- 생성자 주입은 호출 시점이 딱 1이라는 것이 보장된다. 
- 불변, 필수 의존 관계에 사용된다.
- 생성자가 딱 1개라면 @Autowired를 생략해도 자동 주입된다.
- final 키워드를 사용하면 값이 설정되지 않는 오류를 컴파일 시점에서 막아준다. 

```java
// 생성자(Lombok으로 자동 생성)가 딱 1개 있으니 @Autowired 생략가능
@Service // 이 어노테이션은 @Component이 포함되어있다.
@RequiredArgsConstructor // 생성자를 자동 생성해주는 Lombok의 어노테이션이다.

  public class MemberServiceImpl implements MemberService {
  
  private final MemberRepository memberRepository;
  
}
  ```


#### Setter 주입 

- 선택, 변경 가능성이 있을 때 사용하는 방식이다. 

```java
@Service // 이 어노테이션은 @Component이 포함되어있다.
public class MemberServiceImpl implements MemberService {

  private final MemberRepository memberRepository;
  
  @Autowired
  public void setMemberRepository(MemberRepository memberRepository){
    this.memberRepository = memberRepository;
  }
}
  ```

#### 필드 주입

- 권장되는 방식이 아니라 생략.

---

### 권장되는 DI 방식
보통 **생성자 주입** 방식이 권장된다. 대부분의 의존관계는 애플리케이션 종료까지 변경될 일이 없으며, 변경되면 안되는 경우가 대부분이다. 
setter를 사용하면 누군가에 의해 임의로 변경될 수 있으므로, 좋은 방식이 아니다. 

### AOP

AOP는 Aspect-Oriented Programming의 약자로, 관점 지향 프로그래밍이다.

프로그램에서 횡단 관심사를 모듈화하기 위한 기술로, 각 모듈이나 객체의 핵심 비즈니스 로직에 집중할 수 있도록 한다. 
인증, 로깅, 트랜젝션 등 전체 시스템에 공통적으로 필요한 기능에 적용된다. 


