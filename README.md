# Spring cloud demos

## Usage

> 仅依赖 Docker

### 运行
```bash
git clone https://github.com/yanickxia/spring-cloud-demos.git
cd spring-cloud-demos
make run
```

### 验证

- [Eureka Server](http://localhost:8761/)
  ![](https://cdn.jsdelivr.net/gh/yanickxia/picture-bed/20210208183615.png)
- [Eureka Server Client](http://localhost:8081/)
  ![](https://cdn.jsdelivr.net/gh/yanickxia/picture-bed/20210208183641.png)
- [Eureka Server Feign Client](http://localhost:8082/)
  ![](https://cdn.jsdelivr.net/gh/yanickxia/picture-bed/20210208183654.png)
  

### Case

> eureka 是 ap 系统会延迟，测试可以在启动 1 分钟之后执行

1. 从 feign-client 访问 client

```bash
# curl localhost:8082/call
hello from client%
```

2. 从 client 访问 feign-client 
```bash
# curl localhost:8081/call
hello from client%
```