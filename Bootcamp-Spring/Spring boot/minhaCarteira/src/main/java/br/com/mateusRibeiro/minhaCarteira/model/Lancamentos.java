package br.com.mateusRibeiro.minhaCarteira.model;

import br.com.mateusRibeiro.minhaCarteira.enums.TipoLancamento;
import br.com.mateusRibeiro.minhaCarteira.enums.TipoStatus;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "lancamentos", schema = "carteira")
public class Lancamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lancamentos that = (Lancamentos) o;
        return id.equals(that.id) && Objects.equals(descricao, that.descricao) && Objects.equals(mes, that.mes) && Objects.equals(ano, that.ano) && Objects.equals(valor, that.valor) && tipo == that.tipo && status == that.status && Objects.equals(usuario, that.usuario) && Objects.equals(dataCadastro, that.dataCadastro);
    }

    @Override
    public String toString() {
        return "Lancamentos{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", mes=" + mes +
                ", ano=" + ano +
                ", valor=" + valor +
                ", tipo=" + tipo +
                ", status=" + status +
                ", usuario=" + usuario +
                ", dataCadastro=" + dataCadastro +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, mes, ano, valor, tipo, status, usuario, dataCadastro);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Column(name = "descricao")
    private String descricao;


    @Column(name = "mes")
    private Integer mes;

    @Column(name = "ano")
    private Integer ano;

    @Column(name = "valor")
    private BigDecimal valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoLancamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoLancamento tipo) {
        this.tipo = tipo;
    }

    public TipoStatus getStatus() {
        return status;
    }

    public void setStatus(TipoStatus status) {
        this.status = status;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Enumerated(value = EnumType.STRING)
    @Column(name = "tipo")
    private TipoLancamento tipo;

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private TipoStatus status;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "data_cadastro")
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate dataCadastro;




}
