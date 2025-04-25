using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FilaDeProcessos
{
    internal class Processo
    {
        /// <summary>
        /// número do processo
        /// </summary>
        public int Id { get; set; }
        public string Descricao { get; set; }

        /// <summary>
        /// construtor padrão
        /// </summary>
        /// <param name="id">número do processo entre 1 a 1000</param>
        /// <param name="descricao">texto que classifica o processo</param>
        public Processo(int id, string descricao)
        {
            Id = id;
            Descricao = descricao;
        }


        /// <summary>
        /// método que retorna por escrito Alta prioridade (ids entre 0 e 500) ou Baixa prioridade (ids entre 500 e 100)
        /// </summary>
        /// <returns>texto de baixa ou alta prioridade</returns>
        public string informarPrioridade()
        {
            if (Id < 500)
            {
                return "Alta prioridade";
            }
            return "Baixa prioridade";
        }
    }
}
