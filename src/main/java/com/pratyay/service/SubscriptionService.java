package com.pratyay.service;


import com.pratyay.model.PlanType;
import com.pratyay.model.Subscription;
import com.pratyay.model.User;

public interface SubscriptionService {

    Subscription createSubscription(User user);
    Subscription getUsersSubscription(Long userId) throws Exception;

    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
