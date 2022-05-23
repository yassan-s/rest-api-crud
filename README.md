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

## 疑問点
* FormクラスとEntityクラスを分けるメリットは？
  * バリデーションを導入できる
  * 必要最低限のデータをFormクラスに受け取るようにすることで、不必要なデータの登録を防ぐ
    * idやcreateAtなどのユーザが変更しない値など
* どのタイミングでFormクラスを使用し、Entityクラスに変換するのか？
  * GETメソッドの場合
    * リクエストパラメータをFormクラスで取得
    * バリデーションチェック後に、Entityクラスに変換
  * POSTメソッドの場合
    * リクエストボディをFormクラスで取得
    * バリデーションチェック後に、Entityクラスに変換
  * バリデーションを通し、不要な値を弾くことが目的と想定


## 参考サイト
* [Spring MVC コントローラの引数](https://qiita.com/MizoguchiKenji/items/2a041f3a3eb13274e55c#%E3%83%AA%E3%82%AF%E3%82%A8%E3%82%B9%E3%83%88%E3%83%91%E3%83%A9%E3%83%A1%E3%83%BC%E3%82%BF)

* [SpringResponseEntityを使用してHTTP応答を操作する](https://www.baeldung.com/spring-response-entity)

* [@Autowired （SpringBootのアノテーション）](https://springhack.com/autowired-%EF%BC%88springboot%E3%81%AE%E3%82%A2%E3%83%8E%E3%83%86%E3%83%BC%E3%82%B7%E3%83%A7%E3%83%B3%EF%BC%89/)

* [クラス ResponseEntity<T>](https://spring.pleiades.io/spring-framework/docs/current/javadoc-api/org/springframework/http/ResponseEntity.html)

* [MyBatisでLike検索](https://qiita.com/ryuken/items/c160c3b6ed045dc0b435)

* [MyBatis Mapper アノテーションの使い方](https://qiita.com/d-yosh/items/a2bec9718bccfe15a6ae#insert-update-select-delete)

* [文字列を連結する(concat)](https://www.javadrive.jp/javascript/string/index7.html)
