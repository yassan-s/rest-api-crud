# REST API

## 概要
CRUD機能を実装したREST APIです。  


## 環境
DB：Docker + MySQL8.0


## URI

### 全件検索
`http://localhost:8080/games`

### id指定検索
`http://localhost:8080/games/1`

### タイトルとジャンル指定検索
`http://localhost:8080/games/search?title=タイトル&genre=ジャンル`


## 参考サイト
* [@Autowired （SpringBootのアノテーション）](https://springhack.com/autowired-%EF%BC%88springboot%E3%81%AE%E3%82%A2%E3%83%8E%E3%83%86%E3%83%BC%E3%82%B7%E3%83%A7%E3%83%B3%EF%BC%89/)

* [クラス ResponseEntity<T>](https://spring.pleiades.io/spring-framework/docs/current/javadoc-api/org/springframework/http/ResponseEntity.html)

* [MyBatisでLike検索](https://qiita.com/ryuken/items/c160c3b6ed045dc0b435)

* [MyBatis Mapper アノテーションの使い方](https://qiita.com/d-yosh/items/a2bec9718bccfe15a6ae#insert-update-select-delete)

* [文字列を連結する(concat)](https://www.javadrive.jp/javascript/string/index7.html)
