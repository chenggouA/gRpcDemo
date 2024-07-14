import grpc
import test_pb2
import test_pb2_grpc

def run():
    # 连接 gRPC 服务器
    channel = grpc.insecure_channel('localhost:50051')

    # 创建 gRPC 客户端 stub
    stub = test_pb2_grpc.RpcServiceStub(channel)

    # 构造请求消息
    request = test_pb2.Req(query="今天是几号")

    # 调用远程方法
    response = stub.SimpleRpc(request)

    # 处理响应
    print("Response received from server:", response.result)

if __name__ == '__main__':
    run()
