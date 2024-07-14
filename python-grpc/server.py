import grpc
from concurrent import futures
import test_pb2
import test_pb2_grpc

# 实现 gRPC 服务的具体逻辑
class gRpcService(test_pb2_grpc.RpcServiceServicer):
    def SimpleRpc(self, request, context):
        response = test_pb2.Resp()
        response.result = f"{request.query}: unknown"
        return response
    
    def clientStream(self, request_iterator, context):
        for request in request_iterator:
            print(request.query)
        response = test_pb2.Resp()
        response.result = "成功接受到咯"
        return response
    
    def serverStream(self, request, context):
        query = request.query

        arr = ['Ash', 'Chenggou', 'FJF', 'zzz']

        for i in arr:
            response = test_pb2.Resp()
            response.result = i
            yield response


    def doubleStream(self, request_iterator, context):
        for request in request_iterator:
            response = test_pb2.Resp()
            response.result = "服务端收到: " + request.query
            yield response
    


def server():
    # 创建 gRPC 服务器
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))

    # 将服务实现添加到服务器中
    test_pb2_grpc.add_RpcServiceServicer_to_server(
        gRpcService(), server)

    # 监听端口
    server.add_insecure_port('[::]:50051')
    print("Starting server. Listening on port 50051...")
    server.start()
    server.wait_for_termination()

if __name__ == '__main__':
    server()
