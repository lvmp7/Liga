package br.com.nextevolution.controller.conveter;

import br.com.nextevolution.controller.data.response.LigaResponse;
import br.com.nextevolution.entity.Liga;


import java.util.List;

public interface LigaResponseConverter {
    List<LigaResponse> convertToResponse(List<Liga> ligas) ;
}
