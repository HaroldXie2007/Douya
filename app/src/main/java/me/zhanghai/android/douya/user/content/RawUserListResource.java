/*
 * Copyright (c) 2016 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.douya.user.content;

import java.util.List;

import me.zhanghai.android.douya.network.api.ApiError;
import me.zhanghai.android.douya.network.api.ApiRequest;
import me.zhanghai.android.douya.network.api.info.apiv2.SimpleUser;

public abstract class RawUserListResource extends BaseUserListResource<List<SimpleUser>> {

    protected abstract ApiRequest<List<SimpleUser>> onCreateRequest(Integer start, Integer count);

    @Override
    protected void onCallRawLoadFinished(boolean more, int count, boolean successful,
                                         List<SimpleUser> response, ApiError error) {
        onRawLoadFinished(more, count, successful, response, error);
    }
}
