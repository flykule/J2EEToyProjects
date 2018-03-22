# J2EEToyProjects
目前主要是Servlet和Jsp的简单项目
# beerV1项目
* BeerServlet负责在doPost方法中处理请求，转发给result.jsp
* result.jsp负责处理请求数据，生成页面输出给container
* BeerExpert负责获取相应的Beer推荐的建议，用于获取数据
* form.html是负责提供一个简单的下来菜单供用户选择与提交
## 结构
beerV1
├── classes
│   └── com
│       └── example
│           ├── model
│           │   └── BeerExpert.class
│           └── web
│               └── BeerSelect.class
├── etc
│   └── web.xml
├── lib
├── src
│   └── com
│       └── example
│           ├── model
│           │   └── BeerExpert.java
│           └── web
│               └── BeerSelect.java
└── web
    ├── form.html
    └── result.jsp

