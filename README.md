# springboot-uranus

#### 作者
[liujiazhong](https://blog.csdn.net/momo57l)

#### 简介
* 一套基于 Spring Boot2 的生产级快速开发平台

#### 模块
| 项目 | 描述 |
| --- | ---
| uranus-common | 公共依赖组件
| -common-web | web支持模块
| -common-redis | redis支持模块
| uranus-server | 服务端组件

#### 技术
| 后端 | 版本 | 描述 
--- | --- | ---
| SpringBoot | 2.4.5 | 快速开发框架
| hutool | 5.6.5 | 小而全的Java工具类库
| redis | 6.2.3 | 内存数据库
| redisson | 3.15.4 | 提供分布式锁

#### 指令
* 构建docker镜像: mvn compile jib:build
