public class ConversaoDeUnidadesDaArea {

    public static double metrosQuadradosParaPesQuadrados(double metrosQuadrados) {
        return metrosQuadrados * 10.76;
    }

    public static double pesQuadradosParaCentimetrosQuadrados(double pesQuadrados) {
        return pesQuadrados * 929;
    }

    public static double milhasQuadradasParaAcres(double milhasQuadradas) {
        return milhasQuadradas * 640;
    }

    public static double acresParaPesQuadrados(double acres) {
        return acres * 43560;
    }

    //classe de teste
    public class teste{
        public static void main(String[] args) {
                System.out.println(metrosQuadradosParaPesQuadrados(2));
                System.out.println(pesQuadradosParaCentimetrosQuadrados(2));
                System.out.println(milhasQuadradasParaAcres(2));
                System.out.println(acresParaPesQuadrados(2));
        }
    }
}


    
        




