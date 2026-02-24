package nimblix.in.HealthCareHub.controller;

import lombok.RequiredArgsConstructor;
import nimblix.in.HealthCareHub.request.PurchaseOrderRequest;

import nimblix.in.HealthCareHub.response.PurchaseOrderResponse;
import nimblix.in.HealthCareHub.service.PurchaseOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/purchase-orders")
@RequiredArgsConstructor
public class PurchaseOrderController {

    private final PurchaseOrderService purchaseOrderService;

    @PostMapping
    public ResponseEntity<PurchaseOrderResponse> createPurchaseOrder(
            @RequestBody PurchaseOrderRequest request) {

        return ResponseEntity.ok(purchaseOrderService.createPurchaseOrder(request));
    }

    @GetMapping
    public ResponseEntity<List<PurchaseOrderResponse>> getAllPurchaseOrders() {
        return ResponseEntity.ok(purchaseOrderService.getAllPurchaseOrders());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PurchaseOrderResponse> getPurchaseOrderById(@PathVariable Long id) {
        return ResponseEntity.ok(purchaseOrderService.getPurchaseOrderById(id));
    }

    @PutMapping("/approve/{id}")
    public ResponseEntity<PurchaseOrderResponse> approvePurchaseOrder(@PathVariable Long id) {
        return ResponseEntity.ok(purchaseOrderService.approvePurchaseOrder(id));
    }

    @PutMapping("/reject/{id}")
    public ResponseEntity<PurchaseOrderResponse> rejectPurchaseOrder(@PathVariable Long id) {
        return ResponseEntity.ok(purchaseOrderService.rejectPurchaseOrder(id));
    }

    @PutMapping("/receive/{id}")
    public ResponseEntity<PurchaseOrderResponse> receiveGoods(@PathVariable Long id) {
        return ResponseEntity.ok(purchaseOrderService.receiveGoods(id));
    }
}