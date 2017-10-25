package beini.com.dailyapp.http;

import beini.com.dailyapp.http.response.BaseResponseJson;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by beini on 2017/4/14.
 */

public interface RxReServer {

    @POST("{url}")
    Call<BaseResponseJson> insertRequest(@Path("url") String url, @Body Object baseRequestJson);


}