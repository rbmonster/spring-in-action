# Spring in action
- 阅读Spring 实战书籍，摘取一些对自己有用的知识点

## 第一章
- 主要一个是mvc的test用例，可以用来测试controller接口
- 针对security 提供了@WithMockUser的接口

## 第二章
- Lombok注解提供的@Slf4j注解，相当于从LoggerFactory创建一个logger
- @NotBlank @CreditCardNumber @Pattern @Digits 四个实体的注解可以用于实体的信息验证。

## 第三章
- H2嵌入式数据库。加入maven依赖就可以使用的数据库。使用com.h2database
- spring boot 启动自动执行resources下的schema.sql数据库脚本及data.sql的初始化脚本
- KeyHolder自增数据库主键对象，new GenerateKeyHolder()
- @ModelAttribute用来指定在MVC模型中创建对象
- @SessionAttributes("taco") 、@SessionAttribute用于获取存储在Session级别的数据。

Lombok相关注解：
- @NoArgsConstructor(access = AccessLevel.PRIVATE,force = true) 提供一个无参的pri构造方法。
- @RequiredArgsConstructor要求提供一个带参的构造方法，和上述两者公用时将提供一个无参一个带参的构造方法
- @Data ： 注在类上，提供类的get、set、equals、hashCode、canEqual、toString方法
- @AllArgsConstructor ： 注在类上，提供类的全参构造
- @Setter ： 注在属性上，提供 set 方法
- @Getter ： 注在属性上，提供 get 方法
- @EqualsAndHashCode ： 注在类上，提供对应的 equals 和 hashCode 方法
- @Log4j/@Slf4j ： 注在类上，提供对应的 Logger 对象，变量名为 log

## 第四章 spring security