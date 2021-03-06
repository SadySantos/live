package com.dio.live.model;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendario<TipoData> {
    private long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dateEspecial;

}
