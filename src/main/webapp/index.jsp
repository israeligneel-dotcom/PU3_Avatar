<%-- 
    Document   : index
    Created on : 25 oct 2026
    Author     : israe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Avatar - Registro de Artes de Control</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div class="main-container">
            <header>
                <h1>Registro Ancestral de Artes Control</h1>
                <p<strong>00000266861</strong></p>
            </header>
            
            <main class="dashboard-grid">
                <section class="card-panel">
                    <div class="panel-header">
                        <h2>Artes Registradas</h2>
                        <a href="listarArtes" class="btn-secondary">Actualizar Lista</a>
                    </div>
                    
                    <div class="table-responsive">
                        <table>
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Tecnica</th>
                                    <th>Origen</th>
                                    <th>Descripcion</th>
                                    <th>Dificultad</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="arte" items="${artes}">
                                    <tr>
                                        <td>${arte.id}</td>
                                        <td><strong>${arte.nombre}</strong></td>
                                        <td><span class="badge-element">${arte.elementoOrigen}</span></td>
                                        <td>${arte.descripcion}</td>
                                        <td>${arte.nivelDificultad} / 10</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </section>

                <section class="card-panel">
                    <div class="panel-header">
                        <h2>Panel de Registro</h2>
                    </div>
                    
                    <form action="listarArtes" method="POST">
                        <div class="input-group">
                            <label>Nombre de la Tecnica</label>
                            <input type="text" name="nombre" class="input-field">
                        </div>
                        
                        <div class="input-group">
                            <label>Elemento de Origen</label>
                            <input type="text" name="elementoOrigen" class="input-field">
                        </div>
                        
                        <div class="input-group">
                            <label>Descripcion de la Tecnica</label>
                            <input type="text" name="descripcion" class="input-field">
                        </div>
                        
                        <div class="input-group">
                            <label>Nivel de Dificultad (1 - 10)</label>
                            <input type="number" name="nivelDificultad" class="input-field" min="1" max="10">
                        </div>
                        
                        <button type="submit" class="btn-primary">Guardar Registro</button>
                    </form>
                </section>
            </main>
        </div>
    </body>
</html>