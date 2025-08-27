### [수업중 실습2-5] Spring Boot와 JPA(Java Persistence API) 활용( 연관관계 샘플 )

* Student와 StudentDetail 1:1 (OneToOne) 앤티티 연관관계
* Student와 Department 1:N (OneToMany) 앤티티 연관관계
    * FetchType.LAZY vs FetchType.EAGER
    * @JoinColumn, mappedBy
    * 연관관계의 주인(owner 와 종속(non-ower))
        * Owner(BookDetail), Non-Owner(book)
* DTO
* Controller
* Service
* Repository
* DataInsertRunner
* N+1 문제 해결
  * 성능개선
  * HibernateModule 사용하여 BatchSize 설정하기
