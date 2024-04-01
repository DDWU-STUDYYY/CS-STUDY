### ApplicationContext 

스프링 컨테이너라고 한다. BeanFactory 에 부가기능을 추가한 것이다. 

BeanFactory 는 스프링 컨테이너의 최상위 인터페이스이다. 스프링 빈을 관리하고 조회하는 역할을 한다. 

스프링 컨테이너 내부에는 빈 저장소가 존재한다. 빈 저장소는 key 로 빈 이름을 가지고 있으며 value 로 실제 빈 객체를 가지고 있다. 

스프링 컨테이너는 기본적으로 빈을 싱글톤으로 관리해준다.

싱글톤의 장점(매번 인스턴스를 생성할 필요가 없다)


```
ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

StationService stationService = applicationContext.getBean("stationService", StationService.class);

```

📚 클라이언트 요청에 따른 빈(Bean) 처리 과정
1) 클라이언트에서 해당 빈을 요청하기 전 Application Context는 @Configuration 이 붙은 클래스들을 설정 정보로 등록합니다. 또한 해당 클래스 안에 존재하는 @Bean 이 붙은 메소드의 이름으로 빈 목록을 생성합니다 🔥

2) 클라이언트가 해당 빈을 요청합니다.

3) Application Context는 자신의 빈 목록에서 요청한 이름이 있는지 찾습니다.

4) Application Context는 설정 클래스(Configuration Class) 부터 빈 생성을 요청하고
   생성된 빈을 돌려줍니다.
---------------

#### 장점

1) 클라이언트는 @Configuration이 붙은 구체적인 팩토리 클래스를 알 필요가 없다. 애플리케이션 발전 -> 팩토리 클래스 계속해서 증가

애플리케이션 컨텍스트가 없다면 클라이언트는 원하는 객체를 가져오려면 어떤 팩토리 클래스에 접근해야 하는지 알아야 하는 번거로움이 생깁니다.
반면에 애플리케이션 컨텍스트를 사용하면 팩토리가 아무리 많아져도 이에 직접 접근할 필요가 없어, 일관된 방식으로 원하는 Bean을 가져올 수 있습니다.

2) 애플리케이션 컨텍스트는 종합 IoC 서비스를 제공해준다. 애플리케이션 컨텍스트는 객체의 생성과 관계 설정뿐만 아니라 객체가 만들어지는 방식과 시점 및 전략 등을 다르게 가져갈 수 있고, 그 외에도 후처리나 정보의 조합 인터셉트 등과 같은 다양한 기능이 존재합니다.

3) 애플리케이션 컨텍스트를 통해 다양한 빈 검색 방법을 제공할 수 있다. 애플리케이션 컨텍스트에서 Bean 목록을 관리하여, Bean의 이름이나 타입 또는 어노테이션 설정 등으로 빈을 찾을 수 있습니다.(의존성 검색(dependency lookup))

* Spring 컨테이너에는 BeanFactory 와 Application Context 두가지가 있다. 
* 컨테이너 내부에는 빈 저장소가 존재한다. key 로 빈의 이름을 갖고 있고 value 로 실제 빈 객체를 갖고 있다. 
* 