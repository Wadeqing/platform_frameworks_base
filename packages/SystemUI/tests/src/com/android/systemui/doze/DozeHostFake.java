/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.doze;

import android.annotation.NonNull;
import android.app.PendingIntent;

/**
 * A rudimentary fake for DozeHost.
 */
class DozeHostFake implements DozeHost {
    Callback callback;
    boolean pulseAborted;
    boolean pulseExtended;
    boolean animateWakeup;

    @Override
    public void addCallback(@NonNull Callback callback) {
        this.callback = callback;
    }

    @Override
    public void removeCallback(@NonNull Callback callback) {
        this.callback = null;
    }

    @Override
    public void startDozing() {
        throw new RuntimeException("not implemented");
    }

    @Override
    public void pulseWhileDozing(@NonNull PulseCallback callback, int reason) {
        throw new RuntimeException("not implemented");
    }

    @Override
    public void stopDozing() {
        throw new RuntimeException("not implemented");
    }

    @Override
    public void dozeTimeTick() {
        throw new RuntimeException("not implemented");
    }

    @Override
    public boolean isPowerSaveActive() {
        return false;
    }

    @Override
    public boolean isPulsingBlocked() {
        return false;
    }

    @Override
    public void startPendingIntentDismissingKeyguard(PendingIntent intent) {
        throw new RuntimeException("not implemented");
    }

    @Override
    public void abortPulsing() {
        pulseAborted = true;
    }

    @Override
    public void extendPulse() {
        pulseExtended = true;
    }

    @Override
    public void setAnimateWakeup(boolean animateWakeup) {
        this.animateWakeup = animateWakeup;
    }
}
