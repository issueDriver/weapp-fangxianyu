package io.github.nnkwrik.imservice.service;

/**
 * @author nnkwrik
 * @date 18/12/05 12:28
 */
public interface WebSocketService {
    void OnMessage(String senderId, String message);
}
