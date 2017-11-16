package com.gm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Administrator on 2017-01-17.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ctt {

    private int error;
    private String msg;

    @Override
    public String toString() {
        return "Error no:"+error + " Msg:"+ msg;
    }

    public int cx(int a){
        return a+1;
    }
}
