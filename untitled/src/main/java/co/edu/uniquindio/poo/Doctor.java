class HospitalConfig {
    private static HospitalConfig instance;
    private String horarioAtencion;
    private int maxPacientesPorMedico;
    private String reglasFacturacion;

    private HospitalConfig() {}

    public static synchronized HospitalConfig getInstance() {
        if (instance == null) {
            instance = new HospitalConfig();
        }
        return instance;
    }

    public String getHorario() { return horarioAtencion; }
    public void setHorario(String horario) { this.horarioAtencion = horario; }
    public int getMaxPacientes() { return maxPacientesPorMedico; }
    public void setMaxPacientes(int max) { this.maxPacientesPorMedico = max; }
    public String getReglasFacturacion() { return reglasFacturacion; }
    public void setReglasFacturacion(String reglas) { this.reglasFacturacion = reglas; }
}

class Paciente implements Cloneable {
    private String nombre;
    private int edad;
    private String historialEnfermedades;
    private String medicamentos;

    public Paciente(String nombre, int edad, String historialEnfermedades, String medicamentos) {
        this.nombre = nombre;
        this.edad = edad;
        this.historialEnfermedades = historialEnfermedades;
        this.medicamentos = medicamentos;
    }

    @Override
    public Paciente clone() {
        try {
            return (Paciente) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar el paciente", e);
        }
    }
}

class Doctor {
    private String nombre;
    private String especialidad;
    private int id;

    public Doctor(String nombre, String especialidad, int id) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.id = id;
    }
}

class Cita {
    private Paciente paciente;
    private Doctor doctor;
    private String fecha;
    private String hora;

    public Cita(Paciente paciente, Doctor doctor, String fecha, String hora) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.hora = hora;
    }
}

class AnalizadorNombresPacientes {
    public static boolean esPalindromo(String nombre) {
        String limpio = nombre.replaceAll("\\s+", "").toLowerCase();
        return limpio.equals(new StringBuilder(limpio).reverse().toString());
    }

    public static boolean tieneDosVocalesIguales(String nombre) {
        nombre = nombre.toLowerCase();
        int[] vocales = new int[5];
        for (char c : nombre.toCharArray()) {
            int index = "aeiou".indexOf(c);
            if (index >= 0) {
                vocales[index]++;
                if (vocales[index] == 2) return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        // Prueba del Singleton
        HospitalConfig config = HospitalConfig.getInstance();
        config.setHorario("08:00 - 18:00");

        // Prueba del Prototype
        Paciente p1 = new Paciente("Juan Perez", 30, "Diabetes", "Insulina");
        Paciente p2 = p1.clone();

        // Prueba del Analizador
        System.out.println(AnalizadorNombresPacientes.esPalindromo("Ana")); // true
        System.out.println(AnalizadorNombresPacientes.tieneDosVocalesIguales("Eduardo")); // true
    }
}

