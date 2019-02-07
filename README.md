# springcloud_swagger
微服务场景下swagger演示：zuul+swagger,本项目只对springcloud-2.0-api-pay-service-impl支付项目做了swagger集成,订单和会员没有做集成

利用网关zuul统一管理各个微服务的swagger接口文档信息

调整了springcloud zuul网关中Swagger接口生成器集群情况下的使用，目前注释过滤器可以跑，但是放开过滤器就会出问题，是因为过滤器在网关ui层面无法获取到accessToken参数，必须在转发后的详细location之后添加参数才能使之生效；(/api-pay/v2/api-docs)
